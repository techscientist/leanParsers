import java.util.ArrayList;

class RootModel {

	public String description;
	public String type;
	public String email;
	public String timezone;
	public String end_time;
	public VersionModel _version;
	public String schedule_published_on;
	public String logo;
	public String organizer_description;
	public CopyrightModel _copyright;
	public String privacy;
	public int id;
	public Call_for_papersModel _call_for_papers;
	public String background_image;
	public String code_of_conduct;
	public String topic;
	public CreatorModel _creator;
	public String name;
	public String start_time;
	public String organizer_name;
	public String location_name;
	public String state;
	public ArrayList<Social_linksModel> social_links;

	public RootModel(String description, String type, String email, String timezone, String end_time, VersionModel version, String schedule_published_on, String logo, String organizer_description, CopyrightModel copyright, String privacy, int id, Call_for_papersModel call_for_papers, String background_image, String code_of_conduct, String topic, CreatorModel creator, String name, String start_time, String organizer_name, String location_name, String state, ArrayList<Social_linksModel> social_links) {

		this.description = description;
		this.type = type;
		this.email = email;
		this.timezone = timezone;
		this.end_time = end_time;
		this._version = version;
		this.schedule_published_on = schedule_published_on;
		this.logo = logo;
		this.organizer_description = organizer_description;
		this._copyright = copyright;
		this.privacy = privacy;
		this.id = id;
		this._call_for_papers = call_for_papers;
		this.background_image = background_image;
		this.code_of_conduct = code_of_conduct;
		this.topic = topic;
		this._creator = creator;
		this.name = name;
		this.start_time = start_time;
		this.organizer_name = organizer_name;
		this.location_name = location_name;
		this.state = state;
		this.social_links = social_links;

	}

}