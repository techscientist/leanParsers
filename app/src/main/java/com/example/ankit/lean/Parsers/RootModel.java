import java.util.ArrayList;

class RootModel {

	public int id;
	public CreatorModel _creator;
	public String description;
	public String schedule_published_on;
	public String topic;
	public String state;
	public String type;
	public String name;
	public String organizer_description;
	public String privacy;
	public String organizer_name;
	public String background_image;
	public String code_of_conduct;
	public String location_name;
	public String logo;
	public Call_for_papersModel _call_for_papers;
	public String start_time;
	public String end_time;
	public String email;
	public CopyrightModel _copyright;
	public VersionModel _version;
	public String timezone;
	public ArrayList<Social_linksModel> social_links;

	public RootModel(int id, CreatorModel creator, String description, String schedule_published_on, String topic, String state, String type, String name, String organizer_description, String privacy, String organizer_name, String background_image, String code_of_conduct, String location_name, String logo, Call_for_papersModel call_for_papers, String start_time, String end_time, String email, CopyrightModel copyright, VersionModel version, String timezone, ArrayList<Social_linksModel> social_links) {

		this.id = id;
		this._creator = creator;
		this.description = description;
		this.schedule_published_on = schedule_published_on;
		this.topic = topic;
		this.state = state;
		this.type = type;
		this.name = name;
		this.organizer_description = organizer_description;
		this.privacy = privacy;
		this.organizer_name = organizer_name;
		this.background_image = background_image;
		this.code_of_conduct = code_of_conduct;
		this.location_name = location_name;
		this.logo = logo;
		this._call_for_papers = call_for_papers;
		this.start_time = start_time;
		this.end_time = end_time;
		this.email = email;
		this._copyright = copyright;
		this._version = version;
		this.timezone = timezone;
		this.social_links = social_links;

	}

}