import java.util.ArrayList;

class RootModel {

	public String background_image;
	public String email;
	public CopyrightModel _copyright;
	public String state;
	public String topic;
	public String description;
	public CreatorModel _creator;
	public String organizer_description;
	public String schedule_published_on;
	public String type;
	public String end_time;
	public Call_for_papersModel _call_for_papers;
	public String name;
	public ArrayList<Social_linksModel> social_links;
	public String privacy;
	public String location_name;
	public int id;
	public String timezone;
	public String organizer_name;
	public String code_of_conduct;
	public VersionModel _version;
	public String start_time;
	public String logo;

	public RootModel(String background_image, String email, CopyrightModel copyright, String state, String topic, String description, CreatorModel creator, String organizer_description, String schedule_published_on, String type, String end_time, Call_for_papersModel call_for_papers, String name, ArrayList<Social_linksModel> social_links, String privacy, String location_name, int id, String timezone, String organizer_name, String code_of_conduct, VersionModel version, String start_time, String logo) {

		this.background_image = background_image;
		this.email = email;
		this._copyright = copyright;
		this.state = state;
		this.topic = topic;
		this.description = description;
		this._creator = creator;
		this.organizer_description = organizer_description;
		this.schedule_published_on = schedule_published_on;
		this.type = type;
		this.end_time = end_time;
		this._call_for_papers = call_for_papers;
		this.name = name;
		this.social_links = social_links;
		this.privacy = privacy;
		this.location_name = location_name;
		this.id = id;
		this.timezone = timezone;
		this.organizer_name = organizer_name;
		this.code_of_conduct = code_of_conduct;
		this._version = version;
		this.start_time = start_time;
		this.logo = logo;

	}

}