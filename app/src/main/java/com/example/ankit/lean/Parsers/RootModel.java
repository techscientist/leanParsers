import java.util.ArrayList;

class RootModel {

	public String topic;
	public String code_of_conduct;
	public String timezone;
	public VersionModel _version;
	public Call_for_papersModel _call_for_papers;
	public String location_name;
	public String privacy;
	public CopyrightModel _copyright;
	public String schedule_published_on;
	public String start_time;
	public ArrayList<Social_linksModel> social_links;
	public String background_image;
	public String email;
	public int id;
	public String organizer_name;
	public String type;
	public String organizer_description;
	public String end_time;
	public String name;
	public String logo;
	public CreatorModel _creator;
	public String state;
	public String description;

	public RootModel(String topic, String code_of_conduct, String timezone, VersionModel version, Call_for_papersModel call_for_papers, String location_name, String privacy, CopyrightModel copyright, String schedule_published_on, String start_time, ArrayList<Social_linksModel> social_links, String background_image, String email, int id, String organizer_name, String type, String organizer_description, String end_time, String name, String logo, CreatorModel creator, String state, String description) {

		this.topic = topic;
		this.code_of_conduct = code_of_conduct;
		this.timezone = timezone;
		this._version = version;
		this._call_for_papers = call_for_papers;
		this.location_name = location_name;
		this.privacy = privacy;
		this._copyright = copyright;
		this.schedule_published_on = schedule_published_on;
		this.start_time = start_time;
		this.social_links = social_links;
		this.background_image = background_image;
		this.email = email;
		this.id = id;
		this.organizer_name = organizer_name;
		this.type = type;
		this.organizer_description = organizer_description;
		this.end_time = end_time;
		this.name = name;
		this.logo = logo;
		this._creator = creator;
		this.state = state;
		this.description = description;

	}

}