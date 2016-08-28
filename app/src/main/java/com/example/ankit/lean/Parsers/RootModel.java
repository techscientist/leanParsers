import java.util.ArrayList;

class RootModel {

	public String schedule_published_on;
	public String background_image;
	public String organizer_description;
	public CreatorModel _creator;
	public String organizer_name;
	public String code_of_conduct;
	public String name;
	public String email;
	public String description;
	public String end_time;
	public VersionModel _version;
	public String location_name;
	public String state;
	public String topic;
	public Call_for_papersModel _call_for_papers;
	public CopyrightModel _copyright;
	public String type;
	public ArrayList<Social_linksModel> social_links;
	public int id;
	public String logo;
	public String timezone;
	public String start_time;
	public String privacy;

	public RootModel(String schedule_published_on, String background_image, String organizer_description, CreatorModel creator, String organizer_name, String code_of_conduct, String name, String email, String description, String end_time, VersionModel version, String location_name, String state, String topic, Call_for_papersModel call_for_papers, CopyrightModel copyright, String type, ArrayList<Social_linksModel> social_links, int id, String logo, String timezone, String start_time, String privacy) {

		this.schedule_published_on = schedule_published_on;
		this.background_image = background_image;
		this.organizer_description = organizer_description;
		this._creator = creator;
		this.organizer_name = organizer_name;
		this.code_of_conduct = code_of_conduct;
		this.name = name;
		this.email = email;
		this.description = description;
		this.end_time = end_time;
		this._version = version;
		this.location_name = location_name;
		this.state = state;
		this.topic = topic;
		this._call_for_papers = call_for_papers;
		this._copyright = copyright;
		this.type = type;
		this.social_links = social_links;
		this.id = id;
		this.logo = logo;
		this.timezone = timezone;
		this.start_time = start_time;
		this.privacy = privacy;

	}

}