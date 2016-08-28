import java.util.ArrayList;

class RootModel {

	public String email;
	public String organizer_description;
	public String description;
	public String name;
	public String state;
	public int id;
	public String privacy;
	public String logo;
	public String schedule_published_on;
	public String organizer_name;
	public String timezone;
	public String topic;
	public ArrayList<Social_linksModel> social_links;
	public String code_of_conduct;
	public String end_time;
	public String type;
	public CopyrightModel _copyright;
	public String location_name;
	public VersionModel _version;
	public Call_for_papersModel _call_for_papers;
	public String start_time;
	public String background_image;
	public CreatorModel _creator;

	public RootModel(String email, String organizer_description, String description, String name, String state, int id, String privacy, String logo, String schedule_published_on, String organizer_name, String timezone, String topic, ArrayList<Social_linksModel> social_links, String code_of_conduct, String end_time, String type, CopyrightModel copyright, String location_name, VersionModel version, Call_for_papersModel call_for_papers, String start_time, String background_image, CreatorModel creator) {

		this.email = email;
		this.organizer_description = organizer_description;
		this.description = description;
		this.name = name;
		this.state = state;
		this.id = id;
		this.privacy = privacy;
		this.logo = logo;
		this.schedule_published_on = schedule_published_on;
		this.organizer_name = organizer_name;
		this.timezone = timezone;
		this.topic = topic;
		this.social_links = social_links;
		this.code_of_conduct = code_of_conduct;
		this.end_time = end_time;
		this.type = type;
		this._copyright = copyright;
		this.location_name = location_name;
		this._version = version;
		this._call_for_papers = call_for_papers;
		this.start_time = start_time;
		this.background_image = background_image;
		this._creator = creator;

	}

}