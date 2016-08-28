import java.util.ArrayList;

class RootModel {

	public String type;
	public int id;
	public Call_for_papersModel _call_for_papers;
	public String organizer_name;
	public String logo;
	public String code_of_conduct;
	public String description;
	public String topic;
	public CopyrightModel _copyright;
	public String state;
	public String privacy;
	public String location_name;
	public CreatorModel _creator;
	public String organizer_description;
	public VersionModel _version;
	public String email;
	public String end_time;
	public String name;
	public String background_image;
	public String timezone;
	public String schedule_published_on;
	public String start_time;
	public ArrayList<Social_linksModel> social_links;

	public RootModel(String type, int id, Call_for_papersModel call_for_papers, String organizer_name, String logo, String code_of_conduct, String description, String topic, CopyrightModel copyright, String state, String privacy, String location_name, CreatorModel creator, String organizer_description, VersionModel version, String email, String end_time, String name, String background_image, String timezone, String schedule_published_on, String start_time, ArrayList<Social_linksModel> social_links) {

		this.type = type;
		this.id = id;
		this._call_for_papers = call_for_papers;
		this.organizer_name = organizer_name;
		this.logo = logo;
		this.code_of_conduct = code_of_conduct;
		this.description = description;
		this.topic = topic;
		this._copyright = copyright;
		this.state = state;
		this.privacy = privacy;
		this.location_name = location_name;
		this._creator = creator;
		this.organizer_description = organizer_description;
		this._version = version;
		this.email = email;
		this.end_time = end_time;
		this.name = name;
		this.background_image = background_image;
		this.timezone = timezone;
		this.schedule_published_on = schedule_published_on;
		this.start_time = start_time;
		this.social_links = social_links;

	}

}