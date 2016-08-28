import java.util.ArrayList;

class RootModel {

	public Call_for_papersModel _call_for_papers;
	public String logo;
	public VersionModel _version;
	public String start_time;
	public String end_time;
	public String topic;
	public String timezone;
	public String name;
	public String organizer_description;
	public String email;
	public CopyrightModel _copyright;
	public String type;
	public String description;
	public String background_image;
	public String code_of_conduct;
	public int id;
	public CreatorModel _creator;
	public String privacy;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_name;
	public String location_name;
	public String state;
	public String schedule_published_on;

	public RootModel(Call_for_papersModel call_for_papers, String logo, VersionModel version, String start_time, String end_time, String topic, String timezone, String name, String organizer_description, String email, CopyrightModel copyright, String type, String description, String background_image, String code_of_conduct, int id, CreatorModel creator, String privacy, ArrayList<Social_linksModel> social_links, String organizer_name, String location_name, String state, String schedule_published_on) {

		this._call_for_papers = call_for_papers;
		this.logo = logo;
		this._version = version;
		this.start_time = start_time;
		this.end_time = end_time;
		this.topic = topic;
		this.timezone = timezone;
		this.name = name;
		this.organizer_description = organizer_description;
		this.email = email;
		this._copyright = copyright;
		this.type = type;
		this.description = description;
		this.background_image = background_image;
		this.code_of_conduct = code_of_conduct;
		this.id = id;
		this._creator = creator;
		this.privacy = privacy;
		this.social_links = social_links;
		this.organizer_name = organizer_name;
		this.location_name = location_name;
		this.state = state;
		this.schedule_published_on = schedule_published_on;

	}

}